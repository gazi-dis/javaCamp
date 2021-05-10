--
-- PostgreSQL database dump
--

-- Dumped from database version 13.2
-- Dumped by pg_dump version 13.2

-- Started on 2021-05-10 13:24:58

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
-- TOC entry 200 (class 1259 OID 16899)
-- Name: company_users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.company_users (
    "userId" integer NOT NULL,
    "companyName" character varying(250) NOT NULL,
    website character varying(200) NOT NULL,
    phone character varying(30) NOT NULL,
    "isVerifiedBySystem" boolean DEFAULT false NOT NULL
);


ALTER TABLE public.company_users OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 16951)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16946)
-- Name: jobs; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.jobs (
    id integer NOT NULL,
    name character varying(255)
);


ALTER TABLE public.jobs OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 16958)
-- Name: roles; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.roles (
    id integer NOT NULL,
    name character varying(255)
);


ALTER TABLE public.roles OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16909)
-- Name: seeker_users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.seeker_users (
    "userId" integer NOT NULL,
    name character varying(250) NOT NULL,
    "surName" character varying(250) NOT NULL,
    "nationalityId" character varying(11) NOT NULL,
    "birthYear" character varying(4) NOT NULL
);


ALTER TABLE public.seeker_users OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16915)
-- Name: system_users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.system_users (
    "userId" integer NOT NULL,
    name character varying(250) NOT NULL,
    "surName" character varying(250) NOT NULL,
    role integer NOT NULL
);


ALTER TABLE public.system_users OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 16921)
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    id integer NOT NULL,
    email character varying(250) NOT NULL,
    password character varying(250) NOT NULL,
    "isEmailVerified" boolean DEFAULT false NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;

--
-- TOC entry 3021 (class 0 OID 16899)
-- Dependencies: 200
-- Data for Name: company_users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.company_users ("userId", "companyName", website, phone, "isVerifiedBySystem") FROM stdin;
\.


--
-- TOC entry 3025 (class 0 OID 16946)
-- Dependencies: 204
-- Data for Name: jobs; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.jobs (id, name) FROM stdin;
1	Eğitim
2	Sağlık
3	İnşaat
\.


--
-- TOC entry 3027 (class 0 OID 16958)
-- Dependencies: 206
-- Data for Name: roles; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.roles (id, name) FROM stdin;
1	admin
\.


--
-- TOC entry 3022 (class 0 OID 16909)
-- Dependencies: 201
-- Data for Name: seeker_users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.seeker_users ("userId", name, "surName", "nationalityId", "birthYear") FROM stdin;
\.


--
-- TOC entry 3023 (class 0 OID 16915)
-- Dependencies: 202
-- Data for Name: system_users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.system_users ("userId", name, "surName", role) FROM stdin;
\.


--
-- TOC entry 3024 (class 0 OID 16921)
-- Dependencies: 203
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (id, email, password, "isEmailVerified") FROM stdin;
\.


--
-- TOC entry 3033 (class 0 OID 0)
-- Dependencies: 205
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);


--
-- TOC entry 2876 (class 2606 OID 16929)
-- Name: company_users CompanyUsers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.company_users
    ADD CONSTRAINT "CompanyUsers_pkey" PRIMARY KEY ("userId");


--
-- TOC entry 2878 (class 2606 OID 16935)
-- Name: seeker_users SeekerUsers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.seeker_users
    ADD CONSTRAINT "SeekerUsers_pkey" PRIMARY KEY ("userId");


--
-- TOC entry 2882 (class 2606 OID 16937)
-- Name: system_users SystemUsers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.system_users
    ADD CONSTRAINT "SystemUsers_pkey" PRIMARY KEY ("userId");


--
-- TOC entry 2884 (class 2606 OID 16939)
-- Name: users Users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT "Users_pkey" PRIMARY KEY (id);


--
-- TOC entry 2886 (class 2606 OID 16941)
-- Name: users email; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT email UNIQUE (email);


--
-- TOC entry 2888 (class 2606 OID 16950)
-- Name: jobs jobs_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.jobs
    ADD CONSTRAINT jobs_pkey PRIMARY KEY (id);


--
-- TOC entry 2880 (class 2606 OID 16945)
-- Name: seeker_users nationalityId; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.seeker_users
    ADD CONSTRAINT "nationalityId" UNIQUE ("nationalityId");


--
-- TOC entry 2890 (class 2606 OID 16962)
-- Name: roles roles_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.roles
    ADD CONSTRAINT roles_pkey PRIMARY KEY (id);


-- Completed on 2021-05-10 13:24:58

--
-- PostgreSQL database dump complete
--

