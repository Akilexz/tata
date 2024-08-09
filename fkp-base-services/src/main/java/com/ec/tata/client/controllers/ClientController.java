package com.ec.tata.client.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Lazy
@RequestMapping("api/v1/tasks")
@Tag(name = "Task", description = "The Task API")
public class ClientController {

//    @Lazy
//    @Autowired
//    private ITaskService taskService;
//
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    @Operation(summary = "Get all tasks")
//    @ApiResponses(value = { @ApiResponse(responseCode =  "200", description = "List of task", content = { @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Task.class)))})})
//    public ResponseEntity<Response<List<Task>>> findAll() {
//        return new ResponseEntity<>(Response.<List<Task>>builder().data(taskService.findAll()).code(200)
//            .message("SUCCESS").build(), HttpStatus.OK);
//    }
//
//    @PostMapping()
//    @Operation(summary = "Create task")
//    public ResponseEntity<Response<Boolean>> create(@RequestBody CreateTask task) {
//        try {
//            this.taskService.create(task);
//            return new ResponseEntity<>(Response.<Boolean>builder().code(201).message("Created task").build(), HttpStatus.CREATED);
//        } catch(Exception e) {
//            return new ResponseEntity<>(Response.<Boolean>builder().code(201).message("Error to create task").build(), HttpStatus.CREATED);
//        }
//    }
}
