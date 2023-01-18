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

    @PostMapping("/qna")
    public int CreateQ(@RequestBody Qna newQuestion) {
        qnaStore.createQ(newQuestion);
        return qnaStore.getQnaId();
    }
    @PostMapping("/qna")
    public int CreateA(@RequestBody int questionNo, Qna newAnswer) {
        qnaStore.createA(questionNo, newAnswer);
        return qnaStore.getQnaId();
    }

    @PatchMapping("/qna")
    public void UpdateQ(@RequestBody Qna newQuestion) {
        qnaStore.updateQ(newQuestion);
    }

    @PatchMapping("/qna")
    public void UpdateA(@RequestBody int questionNo, Qna newAnswer) { qnaStore.updateA(questionNo, newAnswer); }

    @DeleteMapping("/qna/{questionNo}")
    public void DeleteQ(@PathVariable int questionNo) {
        qnaStore.deleteQ(questionNo);
    }

    @DeleteMapping("/qna/{questionNo}/{answerNo}")
    public void DeleteA(@PathVariable int questionNo, int answerNo) {
        qnaStore.deleteA(questionNo, answerNo);
    }

    @GetMapping("/qna/{qnaNo}")
    public Qna Retrieve(@PathVariable int noteNo) {
        return qnaStore.retrieve(noteNo);
    }

    @GetMapping("/qna")
    public List<Qna> RetrieveAll() {
        return qnaStore.retrieveAll();
    }
}
