package com.kreitek.editor.commands;

import com.kreitek.editor.Command;

import java.util.ArrayList;

public class UndoCommand implements Command {

    @Override
    public void execute(ArrayList<String> documentLines) {
        if (documentLines.isEmpty()){
            documentLines = new ArrayList<>();
        }
        ArrayList<String> rehacer = new ArrayList<>(documentLines);
        documentLines.clear();
        documentLines.addAll(rehacer);
    }
}
