package io.errorgonize.dashboard.service;

import io.errorgonize.dashboard.entity.DashBoard;


import java.util.List;

public interface DashBoardService {
    String register(DashBoard newDashBoard);
    void modify(DashBoard newDashBoard);
    void remove(String writer_id);
    DashBoard find(String writer_id);
    List<DashBoard> findAll();

}
