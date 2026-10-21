# Bloqueio de build

## Fase

Build debug local após a integração da UI Material 3.

## Erro exato

```text
A problem occurred configuring project ':app'.
> SDK location not found. Define a valid SDK location with an ANDROID_HOME environment variable or by setting the sdk.dir path in your project's local properties file at '/home/ubuntu/MaizoSNES-UI-MOD/local.properties'.
```

## Diagnóstico

- `ANDROID_HOME` e `ANDROID_SDK_ROOT` não estão definidos.
- Não existe Android SDK nos caminhos candidatos do sandbox.
- `sdkmanager` não está instalado ou disponível no PATH.
- A falha ocorreu na configuração do Gradle, antes da compilação Kotlin/Compose.

## Próximo passo

Executar no CI do GitHub Actions, que instala o Android SDK, NDK 26.3.11579264 e CMake 3.22.1 definidos no workflow.

Builds locais usadas: 1/3 (bloqueada por ambiente).
