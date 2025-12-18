<?php
require_once "db.php";

if ($_SERVER['REQUEST_METHOD'] !== 'POST') {
    http_response_code(405);
    exit;
}

$id = intval($_POST['id'] ?? 0);
if ($id <= 0) {
    http_response_code(400);
    echo json_encode(['status' => 'error', 'message' => 'ID inválido.']);
    exit;
}

$stmt = mysqli_prepare($conn, "DELETE FROM tarefas WHERE id = ?");
mysqli_stmt_bind_param($stmt, "i", $id);
$ok = mysqli_stmt_execute($stmt);
if ($ok) {
    echo json_encode(['status' => 'success']);
} else {
    http_response_code(500);
    echo json_encode(['status' => 'error', 'message' => mysqli_error($conn)]);
}
mysqli_stmt_close($stmt);
