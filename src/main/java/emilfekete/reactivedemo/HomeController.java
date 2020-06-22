package emilfekete.reactivedemo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {
    @PostMapping("/images")
    public Mono<Void> postImages(@RequestBody Flux<Image> images){
        return images.map(image -> image)
                .then();
    }

    @GetMapping("/images")
    public Flux<Image> getImages(){
        return Flux.just(new Image());
    }
}
