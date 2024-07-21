package com.lj.contact.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by yusen on 2024/7/20 23:24.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result {
    public int code;
    public String message;
    public Object data;

    public static Result success(Object data) {
        return new Result(200, "success", data);
    }

    public static Result success() {
        return success(null);
    }


    public static Result fail(Object data) {
        return new Result(-1, "fail", data);
    }

    public static Result fail() {
        return fail(null);
    }
}
