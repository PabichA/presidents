package com.presidents.controller;


import com.presidents.model.entity.President;
import com.presidents.repository.PresidentsRepository;
import com.presidents.service.president.PresidentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("presidents")
@RestController
@RequiredArgsConstructor
public class PresidentController {

    private final PresidentService presidentService;

    @GetMapping("all")
    public List<President> getAll() {
        return presidentService.getAllPresidents();
    }

    @PostMapping("save")
    public President save(@RequestBody President president) {
        return presidentService.savePresident(president);
    }
//
//    @PutMapping("update")
//    public String updateWithBodyOnly(@RequestBody President president) {
//        if (PresidentDB.presidentRepository.size() - 1 < president.getId()) {
//            president.setId((Integer.valueOf(PresidentDB.presidentRepository.size()).longValue()));
//            PresidentDB.presidentRepository.add(president);
//        } else {
//            PresidentDB.presidentRepository.set(president.getId().intValue(), president);
//        }
//        return "Updated";
//    }
//
//    @PatchMapping("update")
//    public String updatePartial(@RequestBody President president) {
//        President p = PresidentDB.presidentRepository.get(Math.toIntExact(president.getId()));
//        if (president.getName() != null) {
//            p.setName(president.getName());
//        }
//        if (president.getSurname() != null) {
//            p.setSurname(president.getSurname());
//        }
//        if (president.getTermFrom() != null) {
//            p.setTermFrom(president.getTermFrom());
//        }
//        if (president.getTermTo() != null) {
//            p.setTermTo(president.getTermTo());
//        }
//        if (president.getPoliticalParty() != null) {
//            p.setPoliticalParty(president.getPoliticalParty());
//        }
//        return "Updated";
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteByIndex(@PathVariable int id){
//        PresidentDB.presidentRepository.remove(id);
//        return "Removed!";
//    }

}