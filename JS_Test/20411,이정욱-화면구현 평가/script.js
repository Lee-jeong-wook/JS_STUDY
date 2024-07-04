const addBtn = document.querySelector(".addBtn");
const form = document.querySelector("form");
const input = document.querySelector(".todoText");
const todoWrap = document.querySelector(".todoList");
const valid = (text) => {
    return text.trim() === "";
}
form.addEventListener("submit", (e) => {
    e.preventDefault();
    if(valid(input.value)) return alert("빈 문자열은 입력할 수 없음");
    const new_todo = document.createElement("li");
    const new_todo_text = document.createElement("span");
    const new_todo_trash = document.createElement("span");

    new_todo.classList.add("todo");
    new_todo_text.classList.add("task");
    new_todo_trash.classList.add("trash");

    new_todo_text.textContent = input.value;
    new_todo_trash.textContent = "x";

    new_todo.appendChild(new_todo_text);
    new_todo.appendChild(new_todo_trash);
    todoWrap.appendChild(new_todo);

    input.value = "";
    input.focus();
})
// addBtn.addEventListener("click", () => {
//     if(valid(input.value)) return alert("빈 문자열은 입력할 수 없음");
//     const new_todo = document.createElement("li");
//     const new_todo_text = document.createElement("span");
//     const new_todo_trash = document.createElement("span");

//     new_todo.classList.add("todo");
//     new_todo_text.classList.add("task");
//     new_todo_trash.classList.add("trash");

//     new_todo_text.textContent = input.value;
//     new_todo_trash.textContent = "x";

//     new_todo.appendChild(new_todo_text);
//     new_todo.appendChild(new_todo_trash);
//     todoWrap.appendChild(new_todo);

//     input.value = "";
//     input.focus();
// })

todoWrap.addEventListener("click", (e) => {
    switch (e.target.classList[0]) {
        case "trash":
            if(!confirm("정말 삭제하시겠습니까?")) return;
            const deleteElement = e.target.parentElement;
            deleteElement.parentElement.removeChild(deleteElement);
            break;
        case "task":
            e.target.classList.toggle("complete");
            break;
        default:
            break;
    }
})