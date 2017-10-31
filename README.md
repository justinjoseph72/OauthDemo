# OauthDemo

===Using Password Grant
to generate token
`curl -X POST --user 'robin:joseph' -d 'grant_type=password&username=justin&password=joseph' http://localhost:8000/oauth/token`

Response will be 
`{"access_token":"27c1d964-fcad-470f-b32b-219c662e6099","token_type":"bearer","refresh_token":"d7fe669c-cf46-46ee-b790-a9ef39ea7e63","expires_in":3599,"scope":"read write"}
`
use the token
`curl -i -H "Accept: application/json" -H "Authorization: Bearer $TOKEN" -X GET http://localhost:8000/gigy/people`
