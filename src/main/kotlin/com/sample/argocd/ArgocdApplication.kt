package com.sample.argocd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ArgocdApplication

fun main(args: Array<String>) {
	runApplication<ArgocdApplication>(*args)
}
