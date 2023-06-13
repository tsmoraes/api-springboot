# REST API example application

![GitHub repo file count](https://img.shields.io/github/directory-file-count/tsmoraes/api-springboot?style=for-the-badge)
![GitHub repo size](https://img.shields.io/github/repo-size/tsmoraes/api-springboot?style=for-the-badge)

This is a simple example of a REST API for posting text that can receive votes.

#### :feet:Clone the repository

    git clone https://github.com/tsmoraes/api-springboot.git

#### :waxing_crescent_moon:For eclipse/STS

    Right click on the project >> Run As >> Spring Boot App

#### :roller_coaster:Go to url

    localhost:8080/posts

# API endpoints

The REST API to the example app is described below.

## Get list of Posts

### Request

`GET METHOD`

    localhost:8080/posts

## Create a new Post

### Request

`POST METHOD`

    localhost:8080/posts

### JSON sample

    {
        "name": "Example post",
        "voto": 321
    }

## Get a specific Post

### Request

`GET METHOD`

    localhost:8080/posts/{id}

## Change a Post

### Request

`PUT METHOD`

    localhost:8080/posts/{id}

### JSON sample

    {
        "name": "Example post",
        "voto": 321
    }

## Delete a Post

### Request

`DELETE METHOD`

    localhost:8080/posts/{id}

[⬆ Return to top](#REST-API-example-application)<br>

# Author

<table>
  <tr>
    <td align="center">
      <a href="http://github.com/tsmoraes/">
        <img src="https://avatars.githubusercontent.com/u/8061835?v=4" width="100px;" alt="Thiago Moraes"/>
        <br />
        <sub>
          <b>Thiago Moraes</b>
        </sub>
       </a>
       <br />
       <a href="https://www.linkedin.com/in/thiago-s-869667229/" title="Linkedin">perfil</a>
       <br />
       <a href="https://github.com/tsmoraes/RESTful-API-com-Node-Express-Handlebars-e-MongoDB/commits?author=tsmoraes" title="Code">💻</a>
    </td>
  </tr>
</table>
