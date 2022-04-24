## Logging Into Comic Web Database

### Common Commands

### Start Database

From within the ./src/main/docker directory run the docker-compose up command with the appropriate env file.
```bash
$ docker-compose --env-file=./comic-web.env up
```

### Shutdown Database

```bash
$ docker-compose --env-file=./comic-web.env down
```