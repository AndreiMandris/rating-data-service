package com.amandris.ratingdataservice.resources;

import com.amandris.ratingdataservice.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @GetMapping("/{movieId}")
    private Rating getRating(@PathVariable String movieId) {
        return new Rating(movieId, 4);
    }
}
