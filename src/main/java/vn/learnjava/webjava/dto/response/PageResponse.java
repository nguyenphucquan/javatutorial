package vn.learnjava.webjava.dto.response;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class PageResponse<T> {

    private int page;
    private int size;
    private long total;
    private T items;
}