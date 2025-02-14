package guru.springframework.fizz_service.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class FizzPagedList extends PageImpl<FizzDto> {

    public FizzPagedList(List<FizzDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public FizzPagedList(List<FizzDto> content) {
        super(content);
    }
}
