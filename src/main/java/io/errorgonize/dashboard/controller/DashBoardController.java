package io.errorgonize.dashboard.controller;
import io.errorgonize.dashboard.entity.DashBoard;
import io.errorgonize.dashboard.service.DashBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class DashBoardController {
    private final DashBoardService dashboardService;

    @PostMapping("/dashboard")
    public String register(@RequestBody DashBoard newDashBoard) {
        return dashboardService.register(newDashBoard);
    }

    @GetMapping("/dashboard/{writer_id}")
    public DashBoard find(@PathVariable String writer_id) {
        return dashboardService.find(writer_id);
    }

    @GetMapping("/dashboard")
    public List<DashBoard>findAll() {
        return dashboardService.findAll();
    }

    @PutMapping("/dashboard")
    public void modify(@RequestBody DashBoard newDashBoard) {
        dashboardService.modify(newDashBoard);
    }
    @DeleteMapping("/dashboard/{writer_id}")
    public void remove(@PathVariable String writer_id) { dashboardService.remove(writer_id); }
}
