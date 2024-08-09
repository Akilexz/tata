package com.ec.tata.task.vo.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Task
 *
 * @version  1.0.0
 * @author bcueva
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private Long taskId;
    private String name;
    private String description;
}
