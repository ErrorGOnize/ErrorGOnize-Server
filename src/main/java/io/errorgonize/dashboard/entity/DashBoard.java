package io.errorgonize.dashboard.entity;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
public class DashBoard {
            private String writer_id;
            private int question_no;
            private String category;
            private String writer;
            private int view_cnt;
            private String question_title;
            private String question_content;
            //private LocalDate createAt;
            private String createAt;
            private boolean answered;
            private int liked_cnt;

    public DashBoard() { this.writer_id = UUID.randomUUID().toString(); }

    public DashBoard(int question_no, String category, String question_title, String writer, String question_content,
                     String createAt, boolean answered, int view_cnt, int liked_cnt) {
        this();
        this.category = category;
        this.writer = writer;
        this.createAt = createAt;
        this.answered = answered;
        this.question_title = question_title;
        this.question_no = question_no;
        this.view_cnt = view_cnt;
        this.liked_cnt = liked_cnt;
        this.question_content = question_content;
    }

    public static DashBoard sample(){
        //LocalDate.now();
        return new DashBoard(1, "JavaScript", "중첩구문 에러에 관하여",
                "박지성 학부생", "질문내용...........", "2023-01-15", false, 59, 99);
    }
    public static void main(String[] args) {
        DashBoard dashBoard = new DashBoard(2, "React", "중첩구문 에러2에 관하여",
                "김지성 학부생", "질문내용...........",
                "2023-01-13", false, 88, 123);
        System.out.println(new Gson().toJson(dashBoard));
    }
}
