environments {
    development {
        rabbitmq {
            connections = [
                [
                    host    : 'localhost',
                    username: 'guest',
                    password: 'guest'
                ]
            ]
        }
    }
    production {
        rabbitmq {
            connections = [
                [
                    host    : 'rabbitmq',
                    username: 'guest',
                    password: 'guest'
                ]
            ]
        }
    }
}

rabbitmq {
    queues = [
        [
            name: 'reverse',
            durable: true
        ]
    ]
}