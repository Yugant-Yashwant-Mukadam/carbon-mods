import axios from"axios";

const res_api_ser_url = "http://localhost:8080/api/service";

export const ser = () =>  axios.get(res_api_ser_url);

const res_api_cust_url = "http://localhost:8080/api/customer";

const res_api_serbook_url = "http://localhost:8080/api/serbook";

const res_api_bookup_url = "http://localhost:8080/api/bookup";


export const addcust = (customer) =>  axios.post(res_api_cust_url, customer );

export const serbook = (book) =>  axios.post(res_api_serbook_url,book);

export const bookup = (bookupPhone) => axios.get( res_api_bookup_url +'/'+bookupPhone)
