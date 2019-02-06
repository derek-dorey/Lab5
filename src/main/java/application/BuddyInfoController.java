package application;

import entity.BuddyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import buddyInfoRepository.BuddyInfoRepository;

import java.util.List;

@RestController
public class BuddyInfoController {

    @Autowired
    BuddyInfoRepository buddyInfoRepository;

    @GetMapping("/buddy")
    List<BuddyInfo> all() {
        return buddyInfoRepository.findAll();
    }

    @PostMapping("/buddy")
    BuddyInfo newBuddy(@RequestBody BuddyInfo newBuddyInfo) {
        return buddyInfoRepository.save(newBuddyInfo);
    }

    @GetMapping("/buddy/{id}")
    BuddyInfo one(@PathVariable Long id) {

        return buddyInfoRepository.findById(id)
                .orElseThrow(() -> new BuddyNotFoundException(id));
    }

    @DeleteMapping("/buddy/{id}")
    void ghostBuddy(@PathVariable Long id) {
        buddyInfoRepository.deleteById(id);
    }
}
