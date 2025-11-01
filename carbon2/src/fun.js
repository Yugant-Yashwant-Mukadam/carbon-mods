import axios from"axios";

const res_api_ser_url = "http://localhost:8080/api/service";

export const addser = (service) =>  axios.post(res_api_ser_url, service );

const res_api_cust_url = "http://localhost:8080/api/customer";

export const cust = () =>  axios.get(res_api_cust_url);

const res_api_serbook_url = "http://localhost:8080/api/serbook";

export const serboo = () =>  axios.get(res_api_serbook_url);

const res_api_bookup_url = "http://localhost:8080/api/bookup";

export const bookupdate = (bookup) =>  axios.post(res_api_bookup_url,bookup);