console.log("Test");

class Task {
  name = "";
  isComplete = false;
  description;
  dueDate;

  // Must have a name to be created
  constructor(inputName) {
    this.name = inputName;
  }

  getName() {
    return this.name;
  }
  getIsComplete() {
    return this.isComplete;
  }
  getDescription() {
    return this.description;
  }
  getDueDate() {
    return this.dueDate;
  }

  setName(inputName) {
    this.name = inputName;
  }
  setIsComplete(inputBool) {
    this.isComplete = inputBool;
  }
  setDescription(inputDesc) {
    this.description = inputDesc;
  }
  setDueDate(inputDate) {
    this.dueDate = inputDate;
  }
}

// For testing class, remove when done
let task = new Task("Do this thing");
console.log(task.getName);
task.setDescription("Fill in this sheet tomorrow");
console.log(task.getDescription);
