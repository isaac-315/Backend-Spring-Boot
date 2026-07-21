$BASE = "src/main/java/ec/edu/ups/icc/proyectoFinal"

$folders = @(
    "$BASE/config",

    "$BASE/common/dto",
    "$BASE/common/exception",
    "$BASE/common/pagination",
    "$BASE/common/util",

    "$BASE/security/jwt",
    "$BASE/security/userdetails",
    "$BASE/security/ratelimit",

    "$BASE/users/controller",
    "$BASE/users/service/impl",
    "$BASE/users/repository",
    "$BASE/users/entity",
    "$BASE/users/dto/request",
    "$BASE/users/dto/response",
    "$BASE/users/mapper",

    "$BASE/categories/controller",
    "$BASE/categories/service",
    "$BASE/categories/repository",
    "$BASE/categories/entity",
    "$BASE/categories/dto/request",
    "$BASE/categories/dto/response",
    "$BASE/categories/mapper",

    "$BASE/events/controller",
    "$BASE/events/service",
    "$BASE/events/repository",
    "$BASE/events/entity",
    "$BASE/events/dto/request",
    "$BASE/events/dto/response",
    "$BASE/events/mapper",

    "$BASE/registrations/controller",
    "$BASE/registrations/service",
    "$BASE/registrations/repository",
    "$BASE/registrations/entity",
    "$BASE/registrations/dto/request",
    "$BASE/registrations/dto/response",
    "$BASE/registrations/mapper",

    "$BASE/reports/controller",
    "$BASE/reports/service",
    "$BASE/reports/dto/response",

    "$BASE/audit/service",
    "$BASE/audit/repository",
    "$BASE/audit/entity",

    "src/main/resources/db/migration",

    "postman"
)

foreach ($folder in $folders) {
    New-Item -ItemType Directory -Force -Path $folder | Out-Null
}

Write-Host "Estructura de carpetas creada correctamente." -ForegroundColor Green