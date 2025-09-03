console.log("Test");

class Task {
  name = "";
  isComplete = false;
  description;
  dueDate;

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
