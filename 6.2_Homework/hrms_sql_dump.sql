--
-- PostgreSQL database dump
--

-- Dumped from database version 13.2
-- Dumped by pg_dump version 13.2

-- Started on 2021-05-10 01:27:15

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 203 (class 1259 OID 16591)
-- Name: CompanyUsers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."CompanyUsers" (
    "userId" integer NOT NULL,
    "companyName" character varying(250) NOT NULL,
    website character varying(200) NOT NULL,
    phone character varying(30) NOT NULL,
    "isVerifiedBySystem" boolean DEFAULT false NOT NULL
);


ALTER TABLE public."CompanyUsers" OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 16614)
-- Name: Jobs; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Jobs" (
    id integer NOT NULL,
    name character varying(250) NOT NULL
);


ALTER TABLE public."Jobs" OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16583)
-- Name: Roles; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Roles" (
    id integer NOT NULL,
    name character varying(100) NOT NULL
);


ALTER TABLE public."Roles" OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16600)
-- Name: SeekerUsers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."SeekerUsers" (
    "userId" integer NOT NULL,
    name character varying(250) NOT NULL,
    "surName" character varying(250) NOT NULL,
    "nationalityId" character varying(11) NOT NULL,
    "birthYear" character varying(4) NOT NULL
);


ALTER TABLE public."SeekerUsers" OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16575)
-- Name: SystemUsers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."SystemUsers" (
    "userId" integer NOT NULL,
    name character varying(250) NOT NULL,
    "surName" character varying(250) NOT NULL,
    role integer NOT NULL
);


ALTER TABLE public."SystemUsers" OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 16564)
-- Name: Users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Users" (
    id integer NOT NULL,
    email character varying(250) NOT NULL,
    password character varying(250) NOT NULL,
    "isEmailVerified" boolean DEFAULT false NOT NULL
);


ALTER TABLE public."Users" OWNER TO postgres;

--
-- TOC entry 2885 (class 2606 OID 16599)
-- Name: CompanyUsers CompanyUsers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."CompanyUsers"
    ADD CONSTRAINT "CompanyUsers_pkey" PRIMARY KEY ("userId");


--
-- TOC entry 2891 (class 2606 OID 16621)
-- Name: Jobs Jobs_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Jobs"
    ADD CONSTRAINT "Jobs_pkey" PRIMARY KEY (id);


--
-- TOC entry 2883 (class 2606 OID 16590)
-- Name: Roles Roles_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Roles"
    ADD CONSTRAINT "Roles_pkey" PRIMARY KEY (id);


--
-- TOC entry 2887 (class 2606 OID 16607)
-- Name: SeekerUsers SeekerUsers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."SeekerUsers"
    ADD CONSTRAINT "SeekerUsers_pkey" PRIMARY KEY ("userId");


--
-- TOC entry 2881 (class 2606 OID 16582)
-- Name: SystemUsers SystemUsers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."SystemUsers"
    ADD CONSTRAINT "SystemUsers_pkey" PRIMARY KEY ("userId");


--
-- TOC entry 2877 (class 2606 OID 16574)
-- Name: Users Users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Users"
    ADD CONSTRAINT "Users_pkey" PRIMARY KEY (id);


--
-- TOC entry 2879 (class 2606 OID 16880)
-- Name: Users email; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Users"
    ADD CONSTRAINT email UNIQUE (email);


--
-- TOC entry 2893 (class 2606 OID 16876)
-- Name: Jobs name; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Jobs"
    ADD CONSTRAINT name UNIQUE (name);


--
-- TOC entry 2889 (class 2606 OID 16878)
-- Name: SeekerUsers nationalityId; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."SeekerUsers"
    ADD CONSTRAINT "nationalityId" UNIQUE ("nationalityId");


-- Completed on 2021-05-10 01:27:16

--
-- PostgreSQL database dump complete
--

