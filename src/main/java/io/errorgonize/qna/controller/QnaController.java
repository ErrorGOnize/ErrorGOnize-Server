package io.errorgonize.qna.controller;

import io.errorgonize.qna.entity.Qna;
import io.errorgonize.qna.store.QnaStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QnaController {
    @Autowired
    private QnaStore qnaStore;

    @PostMapping("/qna/newqna")
    public int CreateQ(@RequestBody Qna newQuestion) {
        qnaStore.createQ(newQuestion);
        return qnaStore.getQnaId();
    }

    @PostMapping("/qna")
    public int CreateA(@RequestBody Qna newAnswer) {
        qnaStore.createA(newAnswer);
        return qnaStore.getQnaId();
    }

    @PatchMapping("/qna/newqna")
    public void UpdateQ(@RequestBody Qna newQuestion) {
        qnaStore.updateQ(newQuestion);
    }

    @PatchMapping("/qna")
    public void UpdateA(@RequestBody Qna newAnswer) {
        qnaStore.updateA(newAnswer);
    }

    @DeleteMapping("/qna/{question_no}")
    public void DeleteQ(@PathVariable int question_no) {
        qnaStore.deleteQ(question_no);
    }

    @DeleteMapping("/qna/{answer_no}")
    public void DeleteA(@PathVariable int question_no, int answer_no) {
        qnaStore.deleteA(question_no, answer_no);
    }

    @GetMapping("/qna/{question_no}")
    public Qna Retrieve(@PathVariable int question_no) {
        return qnaStore.retrieve(question_no);
    }

    @GetMapping("/qna")
    public List<Qna> RetrieveAll() {
        return qnaStore.retrieveAll();
    }
}
