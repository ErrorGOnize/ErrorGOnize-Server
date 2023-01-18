package io.errorgonize.qna.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Qna {
    private int question_no;
    private int answer_no;
    private String writerQ;
    private String writerA;
    private String writer_idQ;
    private String writer_idA;
    private String question_title;
    private String question_content;
    private String answer_content;
    private LocalDateTime regdateQ;
    private LocalDateTime regdateA;
    private LocalDateTime moddateQ;
    private LocalDateTime moddateA;
    private String category;
    private int answered;
    private int curious;
    private int view_cnt;
    private int clap;
}
