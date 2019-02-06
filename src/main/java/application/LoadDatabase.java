//package application;
//
//import entity.BuddyInfo;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import buddyInfoRepository.BuddyInfoRepository;
//
//@Configuration
//class LoadDatabase {
//
//    @Bean
//    CommandLineRunner initDatabase(BuddyInfoRepository repository) {
//        return args -> {
//            repository.save(new BuddyInfo("Bilbo", "Baggins"));
//            repository.save(new BuddyInfo("Frodo", "Baggins"));
//        };
//    }
//}
