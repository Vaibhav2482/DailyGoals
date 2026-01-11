import { useState } from "react";

function Todo() {

  const [Tasks, setTasks] = useState([]);
  const [newtask, setnewtask] = useState("");

  function handleinputchange(event) {
    setnewtask(event.target.value);
  }

  function AddTask() {
    if (newtask.trim() !== "") {
      setTasks(t => [...t, newtask]);
      setnewtask("");
    }
  }

  function DeleteTask(index) {
    const updatedtasks = Tasks.filter((_, i) => i !== index);
    setTasks(updatedtasks);
  }

  function MoveUp(index) {
    if (index > 0) {
      const updatedtasks = [...Tasks];
      [updatedtasks[index], updatedtasks[index - 1]] =
        [updatedtasks[index - 1], updatedtasks[index]];
      setTasks(updatedtasks);
    }
  }

  function MoveDown(index) {
    if (index < Tasks.length - 1) {
      const updatedtasks = [...Tasks];
      [updatedtasks[index], updatedtasks[index + 1]] =
        [updatedtasks[index + 1], updatedtasks[index]];
      setTasks(updatedtasks);
    }
  }

  return (
    <div className="to-do-list">
      <h1>To Do List</h1>

      <div>
        <input
          type="text"
          placeholder="Enter a Task..."
          value={newtask}
          onChange={handleinputchange}
        />
        <button
          className="add-button"
          onClick={AddTask}>
          Add Task
        </button>
      </div>

      <ol>
        {Tasks.map((task, index) => (
          <li key={index}>
            <span className="task">{task}</span>

            <button
              onClick={() => DeleteTask(index)}
              className="delete-button">
              Delete
            </button>

            <button
              onClick={() => MoveUp(index)}
              className="move-button">
              Up
            </button>

            <button
              onClick={() => MoveDown(index)}
              className="move-button">
              Down
            </button>
          </li>
        ))}
      </ol>
    </div>
  );
}

export default Todo;
