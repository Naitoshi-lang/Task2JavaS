// Function Expression
const guildCouncil = function(reputation, decision) {
    if (reputation >= 100) {
        decision("Принят в элиту");
    } else {
        decision("Отправлен на испытания");
    }
};

// Вызов guildCouncil с репутацией 150 и анонимной функцией
guildCouncil(150, function(message) {
    alert(message);
});

// Пример с репутацией ниже 100
guildCouncil(75, function(message) {
    alert(message);
});
