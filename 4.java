function trainSeeker(startLevel, targetLevel) {
    let currentLevel = startLevel;
    
    while (currentLevel < targetLevel) {
        currentLevel = currentLevel + 1;
        console.log("Тренировка... Текущий уровень: " + currentLevel);
    }
    
    return "Тренировка завершена. Итоговый уровень: " + currentLevel;
}

// Пример вызова:
let result = trainSeeker(3, 7);
console.log(result);

/* Вывод в консоль:
Тренировка... Текущий уровень: 4
Тренировка... Текущий уровень: 5
Тренировка... Текущий уровень: 6
Тренировка... Текущий уровень: 7
Тренировка завершена. Итоговый уровень: 7
*/
