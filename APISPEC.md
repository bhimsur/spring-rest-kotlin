# API Spec

## Division

### Create
- Method : POST
- Endpoint : `/api/division`
- Content-Type : application/json
- Accept : application/json
- Request Body :
    ```json
    {
      "name": "string, unique",
      "description": "string"
    }
    ```
- Response Body :
    ```json
    {
      "data": {
        "success": "boolean"
      }
    }
    ```
### Get
- Method : GET
- Endpoint : `/api/division/{id}`
- Accept : application/json
- Response Body :
    ```json
    {
      "message": "string",
      "data": {
        "id": "UUID",
        "name": "string, unique",
        "description": "string"
      }
    }
    ```
### List
- Method : GET
- Endpoint : `/api/division`
- Accept : application/json
- Response Body :
    ```json
    {
      "message": "string",
      "data": [
        {
          "name": "string, unique",
          "description": "string"
        },
        {
          "name": "string, unique",
          "description": "string"
        }
      ]
    }
    ```

### Update
- Method : PUT
- Endpoint : `/api/division`
- Accept : application/json
- Content-Type : application/json
- Request Body :
    ```json
    {
      "id": "UUID",
      "name": "string, unique",
      "description": "string"
    }
    ```
- Response Body :
    ```json
    {
      "data": {
        "success": "boolean"
      }
    }
    ```
### Delete
- Method : DELETE
- Endpoint : `/api/division/{id}`