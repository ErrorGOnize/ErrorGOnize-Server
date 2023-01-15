package io.errorgonize.dashboard.store;
import io.errorgonize.dashboard.entity.DashBoard;


import java.util.List;

public interface DashBoardStore {

        String create(DashBoard newDashBoard);
        void update(DashBoard newDashBoard);
        void delete(String writer_id);

        DashBoard retrieve(String writer_id);
        List<DashBoard> retrieveAll();
}
