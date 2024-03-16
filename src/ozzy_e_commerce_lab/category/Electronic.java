package ozzy_e_commerce_lab.category;

import day34_abstractionFromJAVAProgramming.carTask.Car;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Electronic extends Category {
    public Electronic(UUID id, String name) {
        super(id, name);
    }

    @Override
    public LocalDateTime findDeliveryDueDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.plusDays(4);
    }

    @Override
    public String generatecategoryCode() {
        return "EL-" + getId().toString().substring(0,8);
    }
}
