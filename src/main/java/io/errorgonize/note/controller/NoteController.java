package io.errorgonize.note.controller;

import io.errorgonize.note.entity.Note;
import io.errorgonize.note.service.NoteService;
import io.errorgonize.note.service.TestDAO;
import io.errorgonize.note.store.logic.TestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @PostMapping("/note")
    public int register(@RequestBody Note newNote) {
        return noteService.register(newNote);
    }

    @GetMapping("/note/{note_no}")
    public Note find(@PathVariable int note_no) {
        return noteService.find(note_no);
    }

    @GetMapping("/note")
    public List<Note> findAll() {
        return noteService.findAll();
    }

    @PutMapping("/note")
    public void modify(@RequestBody Note newNote) {
        noteService.modify(newNote);
    }

    @DeleteMapping("/note/{note_no}")
    public void remove(@PathVariable int note_no) {
        noteService.remove(note_no);
    }
}
