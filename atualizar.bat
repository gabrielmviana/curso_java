@echo off 
title Atualizador de projeto Java 
color 0A 
echo. 
echo === INICIANDO PROCESSO DE COMMIT E PUSH === 
echo. 
git status 
echo. 
git add . 
set /p msg=Digite a mensagem do commit: 
git commit -m "%%msg%%" 
echo. 
echo Enviando para o GitHub... 
git push 
echo. 
echo === PROJETO ATUALIZADO COM SUCESSO! === 
pause 
