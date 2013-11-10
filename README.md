
## Testing

First set some test export environment variables.

```bash
export VCAP_SERVICES='{"sendgrid-n/a":[{"name":"sendgrid-e5af0","label":"sendgrid-n/a","tags":["smtp"],"plan":"free","credentials":{"username":"orion","hostname":"smtp.sendgrid.net","password":"ofsky"}}]}'
```

Then run the tests.

```bash
gradle test -i
``` 
