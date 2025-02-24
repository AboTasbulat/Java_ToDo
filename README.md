# Система управления задачами сделанный на Java
### Консольное приложение
#### Простая консольная программа на Java для управления задачами. Позволяет добавлять, обновлять, удалять и просматривать задачи с указанием их статуса и приоритета.

### 📌 Функции
- ✅ Добавление задачи (название, описание, приоритет)
- 📋 Просмотр всех задач
- ✏️ Обновление задачи (изменение названия, описания, статуса, приоритета)
- ❌ Удаление задачи
- 🔍 Поиск задачи по названию
- 🛡️ Выход из программы

### 🚀 Как запустить
1. **Скопируй репозиторий**:
   ```sh
   git clone https://github.com/твой-юзернейм/task-manager.git
   ```
2. **Открой проект в IDE** (например, IntelliJ IDEA, Eclipse)
3. **Скомпилируй и запусти `Main.java`**

### 📂 Структура проекта
```
📝 main
 ├── 📁 controller        # TaskManager (логика работы с задачами)
 ├── 📁 model             # Task (класс-модель задачи)
 ├── Main.java            # Точка входа
```

### 🛠 Требования
- Java 8+

### 📝 Пример работы
```
--------------------------------------------------
1. Добавить задачу!
2. Просмотреть все задачи!
3. Обновить задачу!
4. Удалить задачу!
5. Искать задачу!
6. Выйти
>>> 1
Введите название задачи: Сделать проект
Введите описание задачи: Завершить код и загрузить в GitHub
Введите приоритет задачи (Важное, Среднее, Низкий): Важное
Задача добавлена успешно!
```
