package com.mahesh.realanalytics.realanalytics.com.mahesh.realanalytics.realanalytics.analyticsdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnalyticsController {

    Logger logger = LoggerFactory.getLogger(AnalyticsController.class);

    @RequestMapping(value = "/postdata", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity savedata(@RequestBody AnalyticsData data) {
        logger.info(data.toString());

    return new ResponseEntity("Product deleted successfully", HttpStatus.OK);

    }



}
