package io.trainee.organiser.company.endpoint;

import io.trainee.organiser.company.constant.CompanyUrlConstant;
import io.trainee.organiser.company.request.CreateStackRequest;
import io.trainee.organiser.company.request.UpdateStackRequest;
import io.trainee.organiser.company.response.StackView;
import io.trainee.organiser.company.service.impl.StackService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1" + CompanyUrlConstant.STACKS_URL)
public class StackController {

    private StackService stackService;

    @GetMapping()
    public List<StackView> findAll() {
        return stackService.findAll();
    }

    @GetMapping(CompanyUrlConstant.ENTITY_ID)
    public StackView findById(@PathVariable("id") UUID id) {
        return stackService.findById(id);
    }

    @PostMapping(CompanyUrlConstant.STACK_URL)
    public StackView create(@RequestBody() CreateStackRequest stackDto) {
        return stackService.create(stackDto);
    }

    @PutMapping(CompanyUrlConstant.ENTITY_ID)
    public StackView update(@RequestBody() UpdateStackRequest stackDto) {
        return stackService.update(stackDto);
    }

    @DeleteMapping(CompanyUrlConstant.ENTITY_ID)
    public void delete(@PathVariable("id") UUID id) {
        stackService.delete(id);
    }
}
