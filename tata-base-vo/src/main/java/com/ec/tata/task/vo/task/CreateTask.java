package com.ec.tata.task.vo.task;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateTask {
    @NotBlank(message = "Name is mandatory")
    private String name;
    private String description;
}
