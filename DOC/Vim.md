# Vim Cheat Sheet

## Cursor Movement

- **h**: Move the cursor to the left.
- **l**: Move the cursor to the right.
- **k**: Move the cursor up.
- **j**: Move the cursor down.
- **w**: Move to the start of the next word.
- **e**: Move to the end of the current word.
- **b**: Move to the beginning of the previous word.
- **0**: Move to the beginning of the current line.
- **^**: Move to the first non-blank character of the current line.
- **$**: Move to the end of the current line.
- **gg**: Move to the beginning of the file.
- **G**: Move to the end of the file.
- **5G**: Move to the 5th line (replace 5 with any line number).

## Exiting Vim

- **:q**: Quit Vim.
- **:q!**: Quit Vim without saving changes.
- **:wq** or **:x**: Save changes and quit Vim.
- **:w**: Save the file without quitting.
- **:w newfilename**: Save the file with a new name.

## Text Deletion Commands

- **x**: Delete the character under the cursor.
- **dw**: Delete from the cursor to the start of the next word.
- **de**: Delete to the end of the current word.
- **d$**: Delete from the cursor to the end of the line.
- **dd**: Delete the entire line. (e.g., `2dd` deletes 2 lines, `3dd` deletes 3 lines)
- **dG**: Delete from the current line to the end of the file.
- **dgg**: Delete from the current line to the beginning of the file.

## Insert Mode

- **i**: Enter insert mode at the cursor position.
- **I**: Enter insert mode at the beginning of the line.
- **a**: Enter insert mode after the cursor.
- **A**: Enter insert mode at the end of the line.
- **o**: Open a new line below the current line and enter insert mode.
- **O**: Open a new line above the current line and enter insert mode.

## Pasting Text

- **p**: Paste text after the cursor.
- **P**: Paste text before the cursor.

## Undo and Redo

- **u**: Undo the last command.
- **U**: Undo all changes on the current line.
- **Ctrl + r**: Redo the last undone change.

## Search and Replace

- **/**: Search forward in the file.
- **?**: Search backward in the file.
- **n**: Move to the next occurrence in the search.
- **N**: Move to the previous occurrence in the search.
- **:%s/old/new/g**: Replace all occurrences of "old" with "new" in the file.
- **:s/old/new/g**: Replace all occurrences of "old" with "new" in the current line.

## Visual Mode

- **v**: Start visual mode, highlight text.
- **V**: Start visual line mode, highlight whole lines.
- **Ctrl + v**: Start visual block mode.

## Miscellaneous Commands

- **yy**: Yank (copy) the current line.
- **2yy**: Yank (copy) 2 lines.
- **p**: Paste the yanked or deleted text after the cursor.
- **P**: Paste the yanked or deleted text before the cursor.
- **.**: Repeat the last command.
- **~**: Toggle case of the character under the cursor.
