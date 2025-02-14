package guru.springframework.fizz_service.web.controller;

import guru.springframework.fizz_service.web.model.FizzDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/fizz")
@RestController
public class FizzController {

    @GetMapping("/{fizzId}")
    public ResponseEntity<FizzDto> getFizzById(@PathVariable("fizzId")UUID fizzId) {
        //todo impl
        return new ResponseEntity<>(FizzDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody FizzDto fizzDto) {
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{fizzId}")
    public ResponseEntity updateFizzById(@PathVariable("fizzId") UUID fizzId, @RequestBody FizzDto fizzDto) {
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
