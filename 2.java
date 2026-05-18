function calcQuestReward(baseGold, difficulty) {
    switch (difficulty) {
        case "easy":
            return baseGold;
        case "normal":
            return baseGold * 1.5;
        case "hard":
            return baseGold * 2;
        case "legendary":
            return baseGold * 5;
        default:
            return "Неизвестная сложность";
    }
}

// Примеры вызова:
console.log(calcQuestReward(100, "easy"));       // 100
console.log(calcQuestReward(100, "normal"));     // 150
console.log(calcQuestReward(100, "hard"));       // 200
console.log(calcQuestReward(100, "legendary"));  // 500
console.log(calcQuestReward(100, "epic"));       // Неизвестная сложность
