# PHP

Skeleton project for PHP.

## Prerequisites

The toolchain this project needs is declared in [`.tool-versions`](./.tool-versions):

```
php 8
```

Install those however you prefer, as long as they end up on your `PATH`. The quickest route is
[mise](https://mise.jdx.dev/), which reads the file for you:

```sh
mise install
```

## Usage
- `./script/setup` to check the toolchain is available and fetch dependencies
- `./script/test` to run the tests
- `./script/start` to run the app

## Structure
- Code located in [`code.php`](./code.php)
- Tests located in [`Tests.php`](./Tests.php)

However, you're free to organise your code as you like.
