package io.errorgonize.dashboard.store.logic;
import io.errorgonize.dashboard.entity.DashBoard;
import io.errorgonize.dashboard.store.DashBoardStore;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class DashBoardStoreLogic implements DashBoardStore {

    private Map<String, DashBoard> dashboardMap;

    public DashBoardStoreLogic() {
        this.dashboardMap = new HashMap<>();
    }
    @Override
    public String create(DashBoard newDashBoard) {
        this.dashboardMap.put(newDashBoard.getWriter_id(), newDashBoard);
        return newDashBoard.getWriter_id();
    }

    @Override
    public void update(DashBoard newDashBoard) {
        this.dashboardMap.put(newDashBoard.getWriter_id(), newDashBoard);
    }

    @Override
    public void delete(String writer_id) {
        this.dashboardMap.remove(writer_id);
    }

    @Override
    public DashBoard retrieve(String writer_id) {
        return this.dashboardMap.get(writer_id);
    }

    @Override
    public List<DashBoard> retrieveAll() {
        return this.dashboardMap.values().stream().collect(Collectors.toList());
    }
}
