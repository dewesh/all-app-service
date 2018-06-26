package com.appster.services.service;

import com.appster.services.common.dto.MatcherAppRequestDTO;
import com.appster.services.common.dto.MatchingAppResponse;
import com.appster.services.common.dto.Person;
import com.appster.services.common.enums.AppNameEnum;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * Created by dagraw2 on 6/26/18.
 */
@RestController
@RequestMapping("/matcherservice/")
public class matcherService {
    @PostMapping("/match")
    public MatchingAppResponse performMatchingOperation(MatcherAppRequestDTO requestDTO) {
        String name = "basicApp";
        System.out.println(requestDTO);
        System.out.println(name);
        System.out.println(requestDTO.toString());
        AppNameEnum appNameEnum = Enum.valueOf(AppNameEnum.class, name);//AppNameEnum.valueOf(name);
        return appNameEnum.provideMatch(requestDTO.getMatcher(),requestDTO.getMatcheeList());
    }
    @GetMapping("/dummy")
    public MatcherAppRequestDTO dummy() {
        MatcherAppRequestDTO matcherAppRequestDTO = new MatcherAppRequestDTO();
        matcherAppRequestDTO.setAppName("basicApp");
        Person person = new Person().withName("dummy").withPhoneNumber(new Long(812330155));
        matcherAppRequestDTO.setMatcher(person);
        matcherAppRequestDTO.setMatcheeList(Arrays.asList(person));
        return matcherAppRequestDTO;
    }
}
