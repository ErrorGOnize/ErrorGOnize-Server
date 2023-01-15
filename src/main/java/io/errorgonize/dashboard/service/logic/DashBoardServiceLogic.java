package io.errorgonize.dashboard.service.logic;

import io.errorgonize.dashboard.entity.DashBoard;
import io.errorgonize.dashboard.service.DashBoardService;
import io.errorgonize.dashboard.store.DashBoardStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class DashBoardServiceLogic implements DashBoardService {

    private final DashBoardStore dashboardStore;

//    public UserServiceLogic(UserStore userStore) {
//        this.userStore = userStore;
//    } @RequiredArgsConstructor 사용하지 않을 시

    @Override
    public String register(DashBoard newDashBoard) { return this.dashboardStore.create(newDashBoard); }

    @Override
    public void modify(DashBoard newDashBoard) { this.dashboardStore.update(newDashBoard); }

    @Override
    public void remove(String writer_id) { this.dashboardStore.delete(writer_id); }

    @Override
    public DashBoard find(String writer_id) { return this.dashboardStore.retrieve(writer_id); }

    @Override
    public List<DashBoard> findAll() { return this.dashboardStore.retrieveAll(); }
}
