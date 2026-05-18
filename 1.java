function registerSeeker(name, level) {
    if (level < 1) {
        return "Ошибка: недопустимый уровень";
    } else if (level >= 1 && level < 5) {
        return "Искатель " + name + " — новичок";
    } else if (level >= 5 && level < 10) {
        return "Искатель " + name + " — опытный";
    } else if (level >= 10) {
        return "Искатель " + name + " — ветеран гильдии";
    }
}

// Примеры вызова:
console.log(registerSeeker("Алекс", 3));   // Искатель Алекс — новичок
console.log(registerSeeker("Мира", 7));    // Искатель Мира — опытный
console.log(registerSeeker("Гром", 12));   // Искатель Гром — ветеран гильдии
console.log(registerSeeker("Тень", 0));    // Ошибка: недопустимый уровень
