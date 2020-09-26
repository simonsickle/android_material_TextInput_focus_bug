# android_material_TextInput_focus_bug

The issue here is that a recycler view with an edit text, using constraint layout and EditText, can not gain focus until contents are input.
If the user deletes all of the contents, the focus is lost. I believe that this should instead focus the view tapped by the user until the keyboard
is explicitly dismissed. Even in the unfocused state, the user can enter data to the view which is even more strange.


Video is located here: https://raw.githubusercontent.com/simonsickle/android_material_TextInput_focus_bug/main/text-input-bug.webm
