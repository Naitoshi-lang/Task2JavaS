function checkQuestAccess(level, hasArtifact, onAllow, onDeny) {
    if (level >= 5 || hasArtifact === true) {
        onAllow();
    } else {
        onDeny();
    }
}

// Вызов функции с анонимными функциями
checkQuestAccess(
    3,
    false,
    function() { alert("Доступ к квесту разрешён"); },
    function() { alert("Вы слишком слабы для этого квеста"); }
);

// Пример, когда доступ разрешён (артефакт есть):
checkQuestAccess(
    2,
    true,
    function() { alert("Доступ к квесту разрешён"); },
    function() { alert("Вы слишком слабы для этого квеста"); }
);
