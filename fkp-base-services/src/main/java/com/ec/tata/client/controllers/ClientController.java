package com.ec.tata.client.controllers;
import com.ec.tata.account.vo.common.Response;
import com.ec.tata.account.vo.customer.CreateCustomerVo;
import com.ec.tata.account.vo.customer.FindAllCustomerVo;
import com.ec.tata.account.vo.customer.UpdateCustomerVo;
import com.ec.tata.person.customer.services.ICustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import javax.ws.rs.PathParam;
import java.util.Date;
import java.util.List;

@RestController
@Lazy
@RequestMapping("api/v1/clientes")
@Tag(name = "Customer", description = "The Customer API")
public class ClientController {

    @Lazy
    @Autowired
    private ICustomerService customerService;

    @GetMapping()
    @Operation(summary = "Get all customer")
    @ApiResponses(value = { @ApiResponse(responseCode =  "200", description = "List of customer", content = { @Content(
            mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = FindAllCustomerVo.class
    )))})})
    public ResponseEntity<Response<List<FindAllCustomerVo>>> findAll() {
        return new ResponseEntity<>(Response.<List<FindAllCustomerVo>>builder().data(customerService.findAll())
                .code(HttpStatus.OK.value())
                .message("SUCCESS").build(), HttpStatus.OK);
    }

    @PostMapping()
    @Operation(summary = "Create customer")
    @io.swagger.v3.oas.annotations.parameters.RequestBody(required = true, description =
            "Information needed to save customer", content = {@Content(mediaType = "application/json",
            schema = @Schema(implementation = CreateCustomerVo.class))})
    public ResponseEntity<Response<Boolean>> create(@RequestBody CreateCustomerVo data) {
        try {
            this.customerService.create(data);
            return new ResponseEntity<>(Response.<Boolean>builder().code(HttpStatus.CREATED.value())
                    .message("Created customer").build(), HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>(Response.<Boolean>builder().code(HttpStatus.CREATED.value())
                    .message("Error to create customer").build(), HttpStatus.CREATED);
        }
    }

    @PutMapping()
    @Operation(summary = "Update customer")
    @io.swagger.v3.oas.annotations.parameters.RequestBody(required = true, description =
            "Information needed to update customer", content = {@Content(mediaType = "application/json",
            schema = @Schema(implementation = UpdateCustomerVo.class))})
    public ResponseEntity<Response<Boolean>> update(@RequestBody UpdateCustomerVo data) {
        try {
            this.customerService.update(data);
            return new ResponseEntity<>(Response.<Boolean>builder().code(HttpStatus.OK.value())
                    .message("Updated customer").build(), HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(Response.<Boolean>builder().code(HttpStatus.OK.value())
                    .message("Error to update customer").build(), HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete customer")
    @Parameter(in = ParameterIn.PATH, description = "id", name = "id",
            schema = @Schema(type = "long"), example = "1")
    public ResponseEntity<Response<Boolean>> delete(@NotBlank @PathVariable("id") Long id) {
        try {
            this.customerService.delete(id);
            return new ResponseEntity<>(Response.<Boolean>builder().code(HttpStatus.OK.value())
                    .message("Delete customer").build(), HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(Response.<Boolean>builder().code(HttpStatus.OK.value())
                    .message("Error to delete customer").build(), HttpStatus.OK);
        }
    }
}
